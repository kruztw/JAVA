all:
	@echo "info: run 'make init' before make\n"
	javac -cp ./jython.jar  simple.java
run:
	java -cp ./jython.jar:. simple


init:
	@echo "download standalone jython.jar from https://www.jython.org/download.html"
	@echo "Our test version is 2.7.3\n"
	wget https://repo1.maven.org/maven2/org/python/jython-standalone/2.7.3/jython-standalone-2.7.3.jar
	mv jython*.jar jython.jar

clean:
	rm *.class
