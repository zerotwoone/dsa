package xyz.mazuninky.dsa.old.structure.graph

interface MutableGraph<T> : Graph<T> {
    operator fun set(fromNode: Int, targetNode: Int, value: T)
}
