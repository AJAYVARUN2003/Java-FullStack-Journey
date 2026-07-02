# Day 9 Notes

## String
- String is a class used to store text.
- String is immutable.
- String literals are stored in the String Pool.

## String Pool
- Stores only one copy of identical string literals.
- Saves memory by reusing existing objects.

## == vs equals()

==  -> Compares object references.

equals() -> Compares string content.

## StringBuilder

- Mutable
- Faster
- Not thread-safe

Methods:
- append()
- insert()
- delete()
- deleteCharAt()
- setCharAt()
- replace()
- reverse()
- charAt()
- substring()
- indexOf()
- lastIndexOf()
- length()
- capacity()
- ensureCapacity()
- setLength()
- trimToSize()
- toString()

## StringBuffer

- Mutable
- Thread-safe
- Slightly slower than StringBuilder

## Difference

String
- Immutable

StringBuilder
- Mutable
- Fast
- Not thread-safe

StringBuffer
- Mutable
- Thread-safe
