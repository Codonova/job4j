package ru.job4j.mutithreading;

public final class Cache {
    private static Cache cache;

    public synchronized static Cache instOf() {
        if (cache == null) {
            cache = new Cache();
        }
        return cache;
    }
}
