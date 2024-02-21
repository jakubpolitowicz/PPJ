/**
 *
 * @author Politowicz Jakub S26211
 */
package UTP1.zad1;

import java.util.*;
import java.util.function.BiConsumer;
import java.util.stream.Collectors;

public class XList<T> extends ArrayList<T> {

    public XList() {
        super();
    }

    public XList(Collection<? extends T> c) {
        super(c);
    }

    @SafeVarargs
    public XList(T... args) {
        super(Arrays.asList(args));
    }

    public static <T> XList<T> of(Collection<? extends T> c) {
        return new XList<>(c);
    }

    @SafeVarargs
    public static <T> XList<T> of(T... args) {
        return new XList<>(args);
    }

    public static XList<String> charsOf(String s) {
        return s.chars()
                .mapToObj(c -> String.valueOf((char) c))
                .collect(XList::new, XList::add, XList::addAll);
    }

    public static XList<String> tokensOf(String s, String... separators) {
        XList<String> result;
        if (separators.length == 0) {
            result = new XList<>(s.split("\\s+"));
        } else {
            result = new XList<>(s.split("[" + String.join("", separators) + "]+"));
        }
        return result;
    }

    public XList<T> union(Collection<T> collection) {
        XList<T> result = new XList<>(this);
        result.addAll(collection);
        return result;
    }

    @SafeVarargs
    public final XList<T> union(T... elements) {
        XList<T> result = new XList<>(this);
        result.addAll(Arrays.asList(elements));
        return result;
    }

    public XList<T> diff(Collection<? extends T> c) {
        return this.stream()
                .filter(e -> !c.contains(e))
                .collect(Collectors.toCollection(XList::new));
    }

    public XList<T> unique() {
        return this.stream()
                .distinct()
                .collect(Collectors.toCollection(XList::new));
    }

    public void forEachWithIndex(BiConsumer<T, Integer> consumer) {
        for (int i = 0; i < size(); i++) {
            consumer.accept(get(i), i);
        }
    }
}