package StructuralPatterns.Facade.videoConverters

class CodecFactory {

    private val codecs = listOf<String>("mp4", "mpeg", "vlc")
    fun extractFromFile(file: VideoFile) : String {


        return file.fileName + "." + codecs.shuffled()[0]
    }
}