//Let’s say we have this two simple classes:
case class Message(value: String){

}

case class Endpoint(prompt: String){
  def send(m: Message) {
    println(this.prompt + " " + m.value)
  }
}

//let’s pretend we want to send a Message to an Endpoint
// in a general function.
// We can create a function that looks like this:

def routeTo(m:Message, e:Endpoint) = {
  e.send(m)
}

//To call this function we would do something like:

routeTo(Message("hola"),Endpoint("sending"))

//let’s suppose we want to send the same message to different
// endpoints. For that we could use the currying technique

def route(m:Message) = {
  (e: Endpoint) => e.send(m)
}

//we have created a function that just receives the Message
// and returns a function that receives the Endpoint and sends the message to that endpoint.
val routeCiao = route(Message("ciao"))

routeCiao(Endpoint("sending again"))


route(Message("hi"))(Endpoint("sender"))

//we can even write above function like this
/*def route(m:Message)(e:Endpoint) = {
  e.send(m)
}*/





