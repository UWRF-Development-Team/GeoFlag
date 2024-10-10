package org.falcon.models.identifier;

import org.falcon.entity.Image;

public class Animal extends Identifier {
    protected String name;
    protected Image image;
    Animal(String name, Image image) {
        this.name = name;
        this.image = image;
    }
}
