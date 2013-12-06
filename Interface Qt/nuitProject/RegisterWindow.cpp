#include "RegisterWindow.h"

//CONSTRUCTORS
RegisterWindow::RegisterWindow() : QDialog()
{
    mainLayout = new QVBoxLayout();

    createRegisterPart();

    setLayout(mainLayout);
    //setVisible(true);
}

RegisterWindow::~RegisterWindow()
{
    //Delete here
}

//METHODS
void RegisterWindow::createRegisterPart()
{
    layoutPart1 = new QHBoxLayout();
    layoutPart2 = new QHBoxLayout();
    layoutPart3 = new QHBoxLayout();
    layoutPart4 = new QHBoxLayout();
    layoutPart5 = new QHBoxLayout();

    askUserID = new QLabel("ID ");
    askUserPass = new QLabel("Password ");
    askUserMail = new QLabel("Mail ");
    askUserCharacter = new QLabel("Character ");

    askUserID->setFixedWidth(100);
    askUserPass->setFixedWidth(100);
    askUserMail->setFixedWidth(100);
    askUserCharacter->setFixedWidth(100);

    editUserID = new QLineEdit();
    editUserPass = new QLineEdit();
    editUserMail = new QLineEdit();

    listCharacter = new QComboBox();
    listCharacter->addItem("Male 1");
    listCharacter->addItem("Female 1");

    buttonCreate = new QPushButton("Create");
    buttonCancel = new QPushButton("Cancel");

    layoutPart1->addWidget(askUserID);
    layoutPart1->addWidget(editUserID);

    layoutPart2->addWidget(askUserPass);
    layoutPart2->addWidget(editUserPass);

    layoutPart3->addWidget(askUserMail);
    layoutPart3->addWidget(editUserMail);

    layoutPart4->addWidget(askUserCharacter);
    layoutPart4->addWidget(listCharacter);

    layoutPart5->addWidget(buttonCreate);
    layoutPart5->addWidget(buttonCancel);

    mainLayout->addLayout(layoutPart1);
    mainLayout->addLayout(layoutPart2);
    mainLayout->addLayout(layoutPart3);
    mainLayout->addLayout(layoutPart4);
    mainLayout->addLayout(layoutPart5);

    //Connection signals
    QObject::connect(buttonCreate,SIGNAL(clicked()),this,SLOT(sendInformations()));
    QObject::connect(buttonCancel,SIGNAL(clicked()),this,SLOT(closeRegistration()));
}

void RegisterWindow::sendInformations()
{
    //Send data

}

void RegisterWindow::closeRegistration()
{
    //CloseEvent
    this->close();
}

