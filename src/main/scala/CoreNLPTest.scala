import edu.stanford.nlp.simple._

object CoreNLPTest extends App {
  val doc = new Document("Hello there Mr. Smith! How are you doing today? Have you been been to London yet? Did you have a meeting in Ink & Co?")

  doc.sentences().forEach{ sent =>
    // We're only asking for words -- no need to load any models yet
    println("The second word of the sentence '" + sent + "' is " + sent.word(1))

    // When we ask for the lemma, it will load and run the part of speech tagger
    println("The third lemma of the sentence '" + sent + "' is " + sent.lemma(2))

    // When we ask for the parse, it will load and run the parser
    println("The tags of the sentence '" + sent + "' are " + sent.nerTags())
  }
}
