# Kotlin Basics Practice

This repository is a personal Kotlin learning project for practicing the language from the ground up before moving into Android development.

## Purpose

The goal of this project is to learn Kotlin step by step by writing small focused programs.  
Each file will cover one concept or a very closely related set of concepts.

## Learning approach

The topics will be learned in a sequence so that advanced syntax is not used before the basics are understood.

The order will generally follow this path:
1. Basics
2. Variables
3. Numbers and data types
4. Operators
5. Conditionals
6. Loops
7. Strings
8. Collections
9. Null safety
10. Functions
11. Ranges and progressions
12. OOP basics
13. Data classes
14. Object features
15. Inheritance and interfaces
16. Exceptions
17. Equality, Type Checks and Casting
18. Advanced Functions and Operators
19. Higher-order functions
20. Collections Advanced
21. Scope Functions
22. Extension Functions
23. Generics
24. Delegation
25. Sequences
26. Inline Functions & Reified Generics
27. Type Aliases
28. Coroutines and Flow
29. Practice problems
30. Bonus syntax and "secret" details

## Project structure

The source code will be placed in:

`app/src/main/kotlin`

Inside that folder, the code will be grouped by topic:

```text
app/src/main/kotlin/
├── basics/
├── variables/
├── numbers/
├── operators/
├── conditionals/
├── loops/
├── strings/
├── collections/
├── null_safety/
├── functions/
├── ranges/
├── oop/
├── data_classes/
├── objects/
├── inheritance/
├── exceptions/
├── equality_and_casting/
├── advanced_functions/
├── higher_order_functions/
├── collections_advanced/
├── scope_functions/
├── extension_functions/
├── generics/
├── delegation/
├── sequences/
├── inline_functions/
├── type_aliases/
├── coroutines/
├── practice/
└── bonus/
```

Each folder will contain small `.kt` files focused on one concept.

## 1) Basics
- hello_world.kt
- comments_line_block_kdoc.kt
- print_and_read_input.kt
- multiline_strings_basics.kt

## 2) Variables
- val_vs_var.kt
- type_inference.kt
- explicit_types.kt
- variable_naming_rules.kt
- scope_basics.kt
- local_vs_top_level_variables.kt
- const_val.kt
- lateinit_var.kt
- nullable_variables.kt
- mutable_vs_immutable_references.kt

## 3) Numbers and data types
- byte_short_int_long.kt
- float_double.kt
- unsigned_integers.kt
- numeric_literals_and_underscores.kt
- hexadecimal_and_binary_literals.kt
- type_conversion_numbers.kt
- chars.kt
- strings.kt
- booleans.kt

## 4) Operators
- arithmetic_operators.kt
- comparison_operators.kt
- logical_operators.kt
- assignment_operators.kt
- increment_decrement.kt
- operator_precedence.kt

## 5) Conditionals
- if_else.kt
- if_as_expression.kt
- if_else_if_ladder.kt
- when_basic_values.kt
- when_multiple_values.kt
- when_with_ranges.kt
- when_with_conditions.kt

## 6) Loops
- for_loop.kt
- for_loop_ranges.kt
- for_loop_progression_step.kt
- while_loop.kt
- do_while_loop.kt
- break_and_continue.kt
- nested_loops.kt

## 7) Strings
- string_templates.kt
- string_concatenation.kt
- string_length_and_indexing.kt
- string_iteration.kt
- multiline_strings.kt
- string_functions.kt

## 8) Collections
- arrays.kt
- list_readonly.kt
- mutable_list.kt
- set_readonly.kt
- mutable_set.kt
- map_readonly.kt
- mutable_map.kt
- collection_iteration.kt

## 9) Null safety
- nullable_types.kt
- safe_call.kt
- elvis_operator.kt
- not_null_assertion.kt
- null_checks.kt
- nullable_string_functions.kt

## 10) Functions
- basic_functions.kt
- return_values.kt
- default_arguments.kt
- named_arguments.kt
- single_expression_functions.kt
- function_overloading.kt

## 11) Ranges and progressions
- ranges.kt
- downTo.kt
- step.kt
- in_operator_ranges.kt

## 12) OOP basics
- classes.kt
- properties.kt
- constructors.kt
- methods.kt
- init_block.kt
- visibility_modifiers.kt

## 13) Data classes
- data_class_basics.kt
- copy_function.kt
- destructuring.kt
- data_class_to_string.kt

## 14) Object features
- object_keyword.kt
- companion_object.kt
- enum_basics.kt
- sealed_classes_intro.kt

## 15) Inheritance and interfaces
- open_classes.kt
- inheritance.kt
- abstract_classes.kt
- interfaces.kt
- super_and_override.kt

## 16) Exceptions
- try_catch.kt
- try_catch_finally.kt
- throw_exception.kt
- custom_exception.kt

## 17) Equality, Type Checks and Casting
- structural_vs_referential_equality.kt (== vs ===)
- equals_and_hashcode_basics.kt (why data classes auto-generate these)
- is_operator_type_checks.kt
- smart_casts.kt
- safe_cast_as_and_as_safe.kt (as vs as?)

## 18) Advanced Functions and Operators
- varargs_functions.kt
- infix_functions.kt (the mechanism behind to, until, step)
- local_functions.kt
- operator_overloading_basics.kt
- labeled_breaks_and_returns.kt

## 19) Higher-order functions
- lambdas.kt
- function_types.kt
- higher_order_functions.kt
- anonymous_functions.kt

## 20) Collections Advanced
- filter.kt
- map.kt
- reduce.kt
- fold.kt
- any_all_none.kt
- groupBy.kt
- sorted.kt

## 21) Scope Functions
(comes after Higher-Order Functions since these are all just specialized lambda receivers)
- let_function.kt
- run_function.kt
- with_function.kt
- apply_function.kt
- also_function.kt
- scope_functions_comparison.kt (side-by-side notes on when to use which)

## 22) Extension Functions
- extension_function_basics.kt
- extension_function_on_string.kt
- extension_function_on_custom_class.kt
- extension_property_basics.kt
- extension_function_with_receiver_lambda.kt (ties back to scope functions)

## 23) Generics
(needs classes/interfaces from OOP + Inheritance, sections 12 & 15)
- generic_function_basics.kt
- generic_class_basics.kt
- multiple_type_parameters.kt
- type_constraints_bounds.kt
- in_out_variance_basics.kt

## 24) Delegation
(property delegation needs lambdas; class delegation needs interfaces)
- property_delegation_by_lazy.kt
- observable_delegate.kt
- class_delegation_by_interface.kt
- map_as_delegate.kt

## 25) Sequences
(builds on Collections + Collections Practice)
- sequence_basics.kt
- sequence_vs_list_performance.kt
- sequence_chained_operations.kt

## 26) Inline Functions & Reified Generics
(needs Higher-Order Functions + Generics)
- inline_function_basics.kt
- noinline_and_crossinline.kt
- reified_generic_type_check.kt

## 27) Type Aliases
- type_alias_basics.kt
- type_alias_for_function_type.kt

## 28) Coroutines and Flow
(the most advanced section — placed last, right before practice problems)
- suspend_function_basics.kt
- runblocking_basics.kt
- launch_builder.kt
- async_await_builder.kt
- dispatchers_basics.kt
- coroutine_scope_basics.kt
- job_and_cancellation.kt
- delay_vs_thread_sleep.kt
- flow_basics.kt
- flow_operators_map_filter.kt
- stateflow_basics.kt
- sharedflow_basics.kt

## 29) Practice problems
- calculator.kt
- evenodd_checker.kt
- prime_checker.kt
- factorial.kt
- fibonacci.kt
- palindrome_checker.kt
- largest_of_three.kt
- student_marks_report.kt
- simple_bank_account.kt
- number_guessing_game.kt

## 30) Bonus syntax and “secret” details
- numeric_underscores.kt
- literals_suffixes.kt
- top_level_functions.kt
- package_basics.kt
- imports_basics.kt
- comments_and_kdoc.kt
- coding_conventions_demo.kt

## Rules for learning

- Keep one topic per file whenever possible.
- Do not use advanced concepts before earlier ones are understood.
- Keep examples short and readable.
- Prefer clear naming over clever code.

## Running the code

Each `.kt` file can be opened and run from IntelliJ IDEA.  
The first runnable file will usually contain a `main()` function.

## Notes

This project is for practice, revision, and building strong Kotlin fundamentals before starting Android development.