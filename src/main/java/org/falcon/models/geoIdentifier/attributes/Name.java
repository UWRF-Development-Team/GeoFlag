package org.falcon.models.geoIdentifier.attributes;

public class Name {
    private String nameText;
    public Name() {
        this.nameText = "";
    }
    public Name(String nameText) {
        this.nameText = nameText;
    }
    @Override
    public boolean equals(Object comparedObject) {
        if (comparedObject instanceof Name comparedName) {
            return this.nameText.equals(comparedName.nameText);
        }
        return false;
    }
}
