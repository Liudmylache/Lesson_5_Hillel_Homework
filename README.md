# Lesson_5_Hillel_Homework
Task 1:
Write examples of arithmetic operations

Task 2:
Sequentially write in the compiler the conversions of all primitive types to each other, including char types, and make a table like this:
|        | byte | short | char | int | long | float | double | boolean |
| ------ | ------ | ------ | ------ | ------ | ------ | ------ | ------ | ------ |
| byte | * | W | N | W | W | W | W | X |
| short | N | * | N | W | W | N | W | X |
| char | N | N | * | N | N | N | N | X |
| int | N | N | N | * | W | W | W | X |
| long | N | N | N | N | * | W | W | X |
| float | N | N | N | N | N | * | W | X |
| double | N | N | N | N | N | N | * | X |
| boolean | X | X | X | X | X | X | X |*|

where:
<p>* - Casting to the same type </p>
<p>N - Narrowing Casting </p>
<p>M - Widening Casting </p>
<p>X - Casting is not possible </p>
