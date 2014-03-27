# Jetty & Spring integration example

This example demonstrates how to create simple application that acts as Webservice server. This app
uses Spring integration WS with embedded jetty server. Let's imagine we've got some WSDL (Contract first approach).
Example create stub classes for this WSDL. From Spring integration perspective, there is WS inbound gateway. All SOAP requests
are processed by this gateway and forwarded into 'input-channel'.

