// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/FormControlLabel")
@file:JsNonModule

package material

external interface FormControlLabelProps : react.RProps {
    /**
     * If `true`, the component appears selected.
     */
    var checked: Boolean

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * The props used for each slot inside.
     * @default {}
     */
    var componentsProps: dynamic
    var typography: dynamic

    /**
     * A control element. For instance, it can be a `Radio`, a `Switch` or a `Checkbox`.
     */
    var control: dynamic

    /**
     * If `true`, the control is disabled.
     */
    var disabled: Boolean

    /**
     * If `true`, the label is rendered as it is passed without an additional typography node.
     */
    var disableTypography: Boolean

    /**
     * Pass a ref to the `input` element.
     */
    var inputRef: dynamic

    /**
     * The text to be used in an enclosing label element.
     */
    var label: react.ReactNode

    /**
     * The position of the label.
     * @default 'end'
     */
    var labelPlacement: dynamic /* 'end' | 'start' | 'top' | 'bottom' */

    var name: String

    /**
     * Callback fired when the state is changed.
     *
     * @param {React.SyntheticEvent} event The event source of the callback.
     * You can pull out the new checked state by accessing `event.target.checked` (boolean).
     */
    var onChange: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: dynamic

    /**
     * The value of the component.
     */
    var value: dynamic
}

/**
 * Drop-in replacement of the `Radio`, `Switch` and `Checkbox` component.
 * Use this component if you want to display an extra label.
 *
 * Demos:
 *
 * - [Checkboxes](https://material-ui.com/components/checkboxes/)
 * - [Radio Buttons](https://material-ui.com/components/radio-buttons/)
 * - [Switches](https://material-ui.com/components/switches/)
 *
 * API:
 *
 * - [FormControlLabel API](https://material-ui.com/api/form-control-label/)
 */
@JsName("default")
external val FormControlLabel: react.FC<FormControlLabelProps>
