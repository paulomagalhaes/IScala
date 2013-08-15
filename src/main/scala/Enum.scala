package org.refptr.iscala

trait Enum[T <: Enum[T]#Value] {
    trait Value { self: T =>
        _values :+= this
        val name = toString.toLowerCase
    }

    private var _values: List[T] = Nil
    def values = _values
}
