#include "MainWindow.h"

//CONSTRUCTORS
MainWindow::MainWindow(QWidget *parent) : QMainWindow(parent)
{
    //Window's size
    sizeInW = width();
    sizeInH = height();

    //Main Layout
    mainLayout = new QVBoxLayout();
    setCentralWidget(new QWidget);
    centralWidget()->setLayout(mainLayout);

    //Widgets
    createBottom();
}

MainWindow::~MainWindow()
{
    //Delete here
}

//METHODS
//Create the chat part
void MainWindow::createBottom()
{
    //Chat
    chatPart = new QLineEdit();
    buttonChatSender = new QPushButton("Envoyer");

    //Link
    bottomPartLayout = new QHBoxLayout();
    bottomPartLayout->addWidget(chatPart);
    bottomPartLayout->addWidget(buttonChatSender);

    mainLayout->addLayout(bottomPartLayout);

    //Connection signals
    QObject::connect(buttonChatSender,SIGNAL(clicked()),this,SLOT(sendChatText()));
}

void MainWindow::sendChatText()
{
    //Champ de saisie non vide ?
    if(chatPart->text().compare("")!=0)
    {
        std::cout<<chatPart->text().toStdString()<<std::endl;
    }
}
