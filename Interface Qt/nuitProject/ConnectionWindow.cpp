#include "ConnectionWindow.h"
#include "RegisterWindow.h"

//CONSTRUCTORS
ConnectionWindow::ConnectionWindow(QWidget *parent) : QMainWindow(parent)
{
    setFixedSize(300,150);

    //Window's size
    sizeInW = width();
    sizeInH = height();

    //Main Layout
    mainLayout = new QVBoxLayout();
    setCentralWidget(new QWidget);
    centralWidget()->setLayout(mainLayout);

    //Widgets
    createConnectionPart();
}

ConnectionWindow::~ConnectionWindow()
{
    //Delete here
}

//METHODS
void ConnectionWindow::createConnectionPart()
{
    //Connection part
    layoutP1 = new QHBoxLayout();
    askUserID = new QLabel("Name ");
    editUserID = new QLineEdit();
    layoutP1->addWidget(askUserID);
    askUserID->setFixedWidth(100);
    layoutP1->addWidget(editUserID);

    layoutP2 = new QHBoxLayout();
    askUserPass = new QLabel("Password ");
    askUserPass->setFixedWidth(100);
    editUserPass = new QLineEdit();
    layoutP2->addWidget(askUserPass);
    layoutP2->addWidget(editUserPass);

    sendUserID = new QPushButton("Connect");
    addNewUser = new QPushButton("Register");

    isUserKnown = new QLabel();

    mainLayout->addLayout(layoutP1);
    mainLayout->addLayout(layoutP2);
    mainLayout->addWidget(sendUserID);
    mainLayout->addWidget(addNewUser);
    mainLayout->addWidget(isUserKnown);

    //Connection signals
    QObject::connect(sendUserID,SIGNAL(clicked()),this,SLOT(sendIDConnection()));
    QObject::connect(addNewUser,SIGNAL(clicked()),this,SLOT(createAccount()));
}

void ConnectionWindow::sendIDConnection()
{
    //Faire la connexion


    //Si connexion fail
    isUserKnown->setText("User or password incorrect...");
}

void ConnectionWindow::createAccount()
{
    //Creer un nouveau compte
    RegisterWindow *registerW = new RegisterWindow();
    registerW->setWindowTitle("Registration");
    registerW->setWindowModality(Qt::ApplicationModal);
    registerW->show();
}
