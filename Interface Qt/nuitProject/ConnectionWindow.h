#ifndef CONNECTIONWINDOW_H
#define CONNECTIONWINDOW_H

#include <QMainWindow>
#include <QWidget>
#include <stdio.h>
#include <iostream>
#include <QObject>
#include <QLineEdit>
#include <QPushButton>
#include <QVBoxLayout>
#include <QLabel>

class ConnectionWindow : public QMainWindow
{
    Q_OBJECT

    public:
        //Constructor
        ConnectionWindow(QWidget *parent=0);

        //Destructor
        ~ConnectionWindow();

    private:
        //Connection part
        void createConnectionPart();

    private slots:
        //Send IDs
        void sendIDConnection();

        //Create account
        void createAccount();

    private:
        //Window's size
        float sizeInW;
        float sizeInH;

        //Main Layout
        QVBoxLayout *mainLayout;

        //Connection part
        QLabel *askUserID;
        QLabel *askUserPass;

        QLineEdit *editUserID;
        QLineEdit *editUserPass;

        QPushButton *sendUserID;
        QPushButton *addNewUser;

        QLabel *isUserKnown;

        QHBoxLayout *layoutP1;
        QHBoxLayout *layoutP2;

};

#endif // CONNECTIONWINDOW_H
