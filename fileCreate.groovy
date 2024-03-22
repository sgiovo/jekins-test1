def createHello(name) {
  new File('hello.txt').text = "Hello, ${name}!"
}
return this