#include <QApplication>
#include "MainWindow.h"
#include "ConnectionWindow.h"

int main(int argc, char *argv[])
{
    QApplication a(argc, argv);
    //MainWindow *w = new MainWindow();
    ConnectionWindow *w = new ConnectionWindow();
    w->showMaximized();
    
    return a.exec();
}
