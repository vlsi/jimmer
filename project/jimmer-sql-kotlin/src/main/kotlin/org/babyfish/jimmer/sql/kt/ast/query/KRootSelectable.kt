package org.babyfish.jimmer.sql.kt.ast.query

import org.babyfish.jimmer.sql.ast.Selection
import org.babyfish.jimmer.sql.ast.tuple.*
import org.babyfish.jimmer.sql.kt.ast.expression.KExpression
import org.babyfish.jimmer.sql.kt.ast.expression.KNonNullExpression

interface KRootSelectable<E: Any> {

    fun <T> select(selection: Selection<T>): KConfigurableTypedRootQuery<E, T>

    fun <T1, T2> select(
        selection1: Selection<T1>,
        selection2: Selection<T2>
    ): KConfigurableTypedRootQuery<E, Tuple2<T1, T2>>

    fun <T1, T2, T3> select(
        selection1: Selection<T1>,
        selection2: Selection<T2>,
        selection3: Selection<T3>
    ): KConfigurableTypedRootQuery<E, Tuple3<T1, T2, T3>>

    fun <T1, T2, T3, T4> select(
        selection1: Selection<T1>,
        selection2: Selection<T2>,
        selection3: Selection<T3>,
        selection4: Selection<T4>
    ): KConfigurableTypedRootQuery<E, Tuple4<T1, T2, T3, T4>>

    fun <T1, T2, T3, T4, T5> select(
        selection1: Selection<T1>,
        selection2: Selection<T2>,
        selection3: Selection<T3>,
        selection4: Selection<T4>,
        selection5: Selection<T5>
    ): KConfigurableTypedRootQuery<E, Tuple5<T1, T2, T3, T4, T5>>

    fun <T1, T2, T3, T4, T5, T6> select(
        selection1: Selection<T1>,
        selection2: Selection<T2>,
        selection3: Selection<T3>,
        selection4: Selection<T4>,
        selection5: Selection<T5>,
        selection6: Selection<T6>
    ): KConfigurableTypedRootQuery<E, Tuple6<T1, T2, T3, T4, T5, T6>>

    fun <T1, T2, T3, T4, T5, T6, T7> select(
        selection1: Selection<T1>,
        selection2: Selection<T2>,
        selection3: Selection<T3>,
        selection4: Selection<T4>,
        selection5: Selection<T5>,
        selection6: Selection<T6>,
        selection7: Selection<T7>
    ): KConfigurableTypedRootQuery<E, Tuple7<T1, T2, T3, T4, T5, T6, T7>>

    fun <T1, T2, T3, T4, T5, T6, T7, T8> select(
        selection1: Selection<T1>,
        selection2: Selection<T2>,
        selection3: Selection<T3>,
        selection4: Selection<T4>,
        selection5: Selection<T5>,
        selection6: Selection<T6>,
        selection7: Selection<T7>,
        selection8: Selection<T8>
    ): KConfigurableTypedRootQuery<E, Tuple8<T1, T2, T3, T4, T5, T6, T7, T8>>

    fun <T1, T2, T3, T4, T5, T6, T7, T8, T9> select(
        selection1: Selection<T1>,
        selection2: Selection<T2>,
        selection3: Selection<T3>,
        selection4: Selection<T4>,
        selection5: Selection<T5>,
        selection6: Selection<T6>,
        selection7: Selection<T7>,
        selection8: Selection<T8>,
        selection9: Selection<T9>
    ): KConfigurableTypedRootQuery<E, Tuple9<T1, T2, T3, T4, T5, T6, T7, T8, T9>>
}