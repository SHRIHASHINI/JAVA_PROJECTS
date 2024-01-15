package com.website;

import java.io.IOException;
import java.nio.file.Paths;

import com.google.zxing.BarcodeFormat;
import com.google.zxing.MultiFormatWriter;
import com.google.zxing.common.BitMatrix;
import com.google.zxing.WriterException;
import com.google.zxing.client.j2se.MatrixToImageWriter;
/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args ) throws WriterException, IOException
    {
        String data="https://www.vecteezy.com/free-photos/picture";
        String path="/Users/shrihashini/OneDrive/Desktop/QRCode.jpg";
        
        BitMatrix matrix=new MultiFormatWriter().encode(data,BarcodeFormat.QR_CODE,500,500);

        MatrixToImageWriter.writeToPath(matrix,"jpg",Paths.get(path));

        System.out.println("Qr code Successfully created");
    }
}
