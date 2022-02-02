// Automatically generated - do not modify!

package mui.base

import kotlinext.js.ReadonlyArray

external interface SelectOption<TValue> {
    var value: TValue

    var label: react.ReactNode

    var disabled: Boolean?
}

external interface SelectOptionGroup {
    var options: dynamic

    var label: react.ReactNode

    var disabled: Boolean?
}

external interface UseSelectSingleProps<TValue> : react.Props {
    var defaultValue: TValue?

    var multiple: dynamic

    var onChange: ((value: TValue?) -> Unit)?

    var value: TValue?
}

external interface UseSelectMultiProps<TValue> : react.Props {
    var defaultValue: dynamic

    var multiple: dynamic

    var onChange: ((value: ReadonlyArray<TValue>) -> Unit)?

    var value: dynamic
}
