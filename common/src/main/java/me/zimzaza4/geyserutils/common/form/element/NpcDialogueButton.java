package me.zimzaza4.geyserutils.common.form.element;

import lombok.Getter;
import lombok.Setter;
import lombok.Value;
import lombok.experimental.Accessors;

import java.io.Serializable;
import java.util.List;

@Setter
@Getter
@Accessors( fluent = true )
public class NpcDialogueButton implements Serializable {
    private String text;
    private List<String> commands;
    private ButtonMode mode;

    public enum ButtonMode {
        BUTTON_MODE,
        ON_ENTER,
        ON_EXIT
    }

}
