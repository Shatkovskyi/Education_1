package com.courses.io;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

/**
 * Created by Vladimir on 02.05.2015.
 */
public class Outputer {

    // ���� � ����� ������� ����� ������ � ����������
    private String filePath;

    public Outputer(String filePath) {
        this.filePath = filePath;
    }

    // ������ � ���� ��������� OutputStream
    public void write(String st) throws IOException {
        // �������������� ����� ��� ������ ������
        // ��� �������� ��� �������� ����� ������ � ����
        OutputStream outputStream = new FileOutputStream(filePath);
        // �������� ���������� ������ st � �������� � � byte �������.
        outputStream.write(st.getBytes());
        // ��������� ����� ������
        // ������ ����� ���� ��� �� ������� ����� ������ ������� � ����.
        outputStream.close();
    }
}

