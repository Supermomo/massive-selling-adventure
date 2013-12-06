#ifndef REGISTERWINDOW_H
#define REGISTERWINDOW_H

#include <QMainWindow>
#include <QWidget>
#include <stdio.h>
#include <iostream>
#include <QObject>
#include <QLineEdit>
#include <QPushButton>
#include <QVBoxLayout>
#include <QLabel>
#include <QComboBox>
#include <QDialog>
#include <QtNetwork/QNetworkAccessManager>

class RegisterWindow : public QDialog
{
    Q_OBJECT

    public:
        //Constructor
        RegisterWindow();

        //Destructor
        ~RegisterWindow();

    private:
        //register part
        void createRegisterPart();

    private slots:
        //Send registration
        void sendInformations();

        //Close registration
        void closeRegistration();

    private:
        //Main Layout
        QVBoxLayout *mainLayout;

        //Layouts
        QHBoxLayout *layoutPart1;
        QHBoxLayout *layoutPart2;
        QHBoxLayout *layoutPart3;
        QHBoxLayout *layoutPart4;
        QHBoxLayout *layoutPart5;

        QLabel *askUserID;
        QLabel *askUserPass;
        QLabel *askUserMail;
        QLabel *askUserCharacter;

        QLineEdit *editUserID;
        QLineEdit *editUserPass;
        QLineEdit *editUserMail;

        QComboBox *listCharacter;

        QPushButton *buttonCreate;
        QPushButton *buttonCancel;

};

#endif // REGISTERWINDOW_H
