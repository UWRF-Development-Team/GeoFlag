package org.falcon.entity;

public class Image {
    public byte[] image;
    public String filepath;

    public enum Filetype {
        PNG,
        JPG,
        SVG,
        BMP;

        public String filetype;

        Filetype() {
            
        }
    }

}
