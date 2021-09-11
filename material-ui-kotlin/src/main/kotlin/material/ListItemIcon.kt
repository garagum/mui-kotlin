// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/ListItemIcon")
@file:JsNonModule

package material

external interface ListItemIconProps : react.PropsWithChildren {
    /**
     * The content of the component, normally `Icon`, `SvgIcon`,
     * or a `@mui/icons-material` SVG icon element.
     */
    override var children: Array<out react.ReactNode>?

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: ListItemIconClasses

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: SxProps<Theme>
}

/**
 * A simple wrapper to apply `List` styles to an `Icon` or `SvgIcon`.
 *
 * Demos:
 *
 * - [Lists](https://material-ui.com/components/lists/)
 *
 * API:
 *
 * - [ListItemIcon API](https://material-ui.com/api/list-item-icon/)
 */
@JsName("default")
external val ListItemIcon: react.FC<ListItemIconProps>
