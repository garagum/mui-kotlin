// Automatically generated - do not modify!

@file:JsModule("@material-ui/core/ListItemAvatar")
@file:JsNonModule

package material

external interface ListItemAvatarProps : react.RProps {
    /**
     * The content of the component, normally an `Avatar`.
     */
    var children: react.ReactNode

    /**
     * Override or extend the styles applied to the component.
     */
    var classes: dynamic

    /**
     * The system prop that allows defining system overrides as well as additional CSS styles.
     */
    var sx: dynamic
}

/**
 * A simple wrapper to apply `List` styles to an `Avatar`.
 *
 * Demos:
 *
 * - [Lists](https://material-ui.com/components/lists/)
 *
 * API:
 *
 * - [ListItemAvatar API](https://material-ui.com/api/list-item-avatar/)
 */
@JsName("default")
external val ListItemAvatar: react.FC<ListItemAvatarProps>
