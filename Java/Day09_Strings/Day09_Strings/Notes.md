# Day 9 Revision Notes

## String
- String is a class.
- Stores text.
- Immutable.
- Stored in the String Pool when created using string literals.

## String Pool
- Stores only one copy of identical string literals.
- Saves memory by reusing existing String objects.

Example:

String s1 = "Java";
String s2 = "Java";

Only one String object is created.

## ==

- Compares object references.

## .equals()

- Compares the actual string content.

## StringBuilder

- Mutable.
- Modifies the same object.
- Faster than String when making repeated changes.

### Methods

append()

Adds text to the end.

insert()

Adds text at a specified index.

delete()

Removes characters.

replace()

Replaces part of the text.

reverse()

Reverses the string.
