import org.apache.tika.Tika
import org.apache.tika.metadata.Metadata
import org.apache.tika.parser.AutoDetectParser
import org.apache.tika.sax.BodyContentHandler

import java.nio.file.Files
import java.nio.file.Paths

class Application {

    def PHOTO_METADATA_TO_STORE = ['GPS Latitude', 'GPS Latitude Ref', 'GPS Longitude', 'GPS Longitude Ref', 'date', 'Make', 'Model', 'Software']
    static void main(String[] args) {
        Files.list(Paths.get('src/main/resources/photos'))
        .each {
            println(it.fileName.toString())
            it.withInputStream { s ->
                facadeParsing(s)
            }
            it.withInputStream { s ->
                autoDetectParser(s)
            }
            println('---------------')
        }
    }
    static void facadeParsing(InputStream stream) {
        Tika tika = new Tika()
        //println tika.parseToString(stream)
        println tika.detect(stream)
    }

    static void autoDetectParser(InputStream stream) {
        AutoDetectParser parser = new AutoDetectParser()
        BodyContentHandler handler = new BodyContentHandler()
        Metadata metadata = new Metadata()
        parser.parse(stream, handler, metadata)

        metadata.names().sort().each {
            println "$it = ${metadata.getValues(it).toArrayString()}"
        }
    }
}
