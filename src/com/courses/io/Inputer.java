package com.courses.io;

import java.io.*;
/**
 * Created by Vladimir on 02.05.2015.
 */


public class Inputer {

    // ���� � ����� ������� ����� ������ � ����������
    private String filePath;


    public Inputer(String filePath) {
        this.filePath = filePath;
    }

    // ������ ����� ��������� InputStream
    public void read() throws IOException {
        // �������������� ����� �� ������
        InputStream inputstream = new FileInputStream(filePath);

        // ������ ������ ������ � ������ (ASCII)
        int data = inputstream.read();
        char content;
        // �� ������� ������ ���� ����
        while(data != -1) {
            // ����������� ���������� ���� � ������
            content = (char) data;
            // ������� �����������
            System.out.print(content);
            data = inputstream.read();
        }
        // ��������� �����
        inputstream.close();
    }

    public int countNumOfSymbols() throws IOException {
        int numOfSymbols = 0;
        InputStream inputstream = new FileInputStream(filePath);

        int data;

         do {
            data = inputstream.read();
            numOfSymbols++;

        }while(data != -1);
        // ��������� �����
        inputstream.close();
        return numOfSymbols;
    }
}
