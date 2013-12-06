#ifndef MAINWINDOW_H
#define MAINWINDOW_H

#include <QMainWindow>
#include <QWidget>
#include <stdio.h>
#include <iostream>
#include <QObject>
#include <QLineEdit>
#include <QPushButton>
#include <QVBoxLayout>

class MainWindow : public QMainWindow
{
    Q_OBJECT

    public:
        //Constructor
        MainWindow(QWidget *parent = 0);

        //Destructor
        ~MainWindow();

    private:
        //Bottom part
        void createBottom();

    private slots:
        //Send action
        void sendChatText();

    private:
        //Window's size
        float sizeInW;
        float sizeInH;

        //Main Layout
        QVBoxLayout *mainLayout;

        //Chat part
        QHBoxLayout *bottomPartLayout;
        QLineEdit   *chatPart;
        QPushButton *buttonChatSender;

};

#endif // MAINWINDOW_H
