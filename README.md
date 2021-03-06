aliveclipse
===========

It is recommended to increase the memory that Eclipse can get. To make things easy, if your Luna installation is new and/or you do not already have a configuration file for Eclipse, you can copy `eclipse.ini` from the root of this repository to the root of your Eclipse installation.

Required software
-----------------

* Maven
* Eclipse Luna
* Acceleo 3.4: http://download.eclipse.org/modeling/m2t/acceleo/updates/releases/3.4/R201306101458
* Eclipse Modeling plugins (all of them, under Modeling), m2e, and Eclipse Web Developer Tools: http://download.eclipse.org/releases/luna
* Tycho Configurator: Preferences/Maven/Discovery -> Tycho Configurator
* Graphical Editing Framework: http://download.eclipse.org/tools/gef/updates/releases/
* ATL and Operational QVT Plugins (at Install Modeling Components in the Eclipse
  menu)

Usage
-----

* Install all the required software before beginning the following steps
* Run mvn install from the aliveclipse/net.sf.ictalive.commons folder
* Open the Eclipse with the aliveclipse/ directory as the workspace and
  import all the projects (without copying them)


