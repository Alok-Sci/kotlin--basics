package operators

/**
 * Operator Precedence
 * Kotlin has a pre-defined precedence/priority list for operators
 * which the compiler follows, in order to evaluate operations.
 *
 * Precedence Rules (Highest Priority to Lowest):
 * 1. Parentheses                 : ( ) -> Always forces execution first
 * 2. Postfix Increment/Decrement : expr++, expr--
 * 3. Prefix Unary Operators     : ++expr, --expr, +expr, -expr, !expr
 * 4. Multiplicative              : *, /, %
 * 5. Additive                    : +, -
 * 6. Range                       : ..
 * 7. Infix Named Functions       : shl, shr, and, or, xor, etc.
 * 8. Comparison / Type Check     : <, >, <=, >=, as, as?, is, !is
 * 9. Equality                    : ==, !=, ===, !==
 * 10. Logical AND                : &&
 * 11. Logical OR                 : ||
 * 12. Assignments                : =, +=, -=, *=, /=, %=
 *  *
 * Associativity Rule:
 * When operators have the exact same precedence level (e.g., 10 - 4 + 2),
 * Kotlin evaluates them from Left-to-Right.
 * Exception: Assignment operators evaluate from Right-to-Left.
 *
 */

fun main(){
    val val1 = 443 + 43 * 34 - 43 + 3 / 3 % 5
    // 43*34=1462, 3/3=1%5=1 => 443 + 1462 - 43 + 1 => 443+1462=1905-43=1862+1 => 1863
    println(val1) // 1863
    val expEqual = val1 == 45 // false
    println(expEqual)
    val expNotEqual = 93 != 33 // true
    println(expNotEqual)
    val expEquality = 45 === 45 // true
    println(expEquality)
    val expNotEquality = 439 !== 438 // true
    println(expNotEquality)
    val expNegate = !(expNotEquality) // false
    println(expNegate)
    println( expEqual || expEquality &&  expNotEqual || expNegate)
    // false || true && true || false => false || true || false => true || false => true
}