package ru.matyunin.inno.task1.model;

import java.util.*;

public class MathBox<E extends Number> {
    private Set<E> arrayNumberSet = new HashSet<>();

    public MathBox(E[] arrayNumberList) {
        this.arrayNumberSet.addAll(Arrays.asList(arrayNumberList));
    }

    public void setArrayNumberList(Set<E> arrayNumberSet) {
        this.arrayNumberSet = arrayNumberSet;
    }

    @Override
    public String toString() {
        return "MathBox{" +
                "arrayNumberList=" + arrayNumberSet +
                '}' + '\n';
    }

    public <V extends E> void del(V removableElement) {
        this.arrayNumberSet.remove(removableElement);
    }

    public double summator() {
        double n = 0.0;
        for (E e : arrayNumberSet) {
            n += e.doubleValue();
        }
        return n;
    }

    public <T extends E> void div(T divider) {
        if (divider.intValue() == 0) {
            System.out.println("на ноль делить нельзя");
            return;
        }
        Set<Number> tempSet = new HashSet();
        for (E e : this.arrayNumberSet) {
            tempSet.add(e.doubleValue() / divider.longValue());
        }
        this.setArrayNumberList((Set<E>) tempSet);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MathBox<?> mathBox = (MathBox<?>) o;
        return Objects.equals(arrayNumberSet, mathBox.arrayNumberSet);
    }

    @Override
    public int hashCode() {
        return Objects.hash(arrayNumberSet);
    }
}
