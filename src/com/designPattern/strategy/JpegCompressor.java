package com.designPattern.strategy;

public class JpegCompressor implements Compressor{
    @Override
    public void compress(String fileName) {
        System.out.println("Compressing Using JPEG");
    }
}
