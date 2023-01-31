package dev.kevinyohe.garden2023.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Hint {
    public String hintText;

    public Hint(String s) {
        this.hintText = s;
    }
}
