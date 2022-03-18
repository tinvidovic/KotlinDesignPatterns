package StructuralPatterns.Facade.facades

import StructuralPatterns.Facade.videoConverters.CodecFactory
import StructuralPatterns.Facade.videoConverters.Converter
import StructuralPatterns.Facade.videoConverters.VideoFile

class MyVideoConverter {

    fun convert(fileName : String) : String {

        val videoFile = VideoFile(fileName)

        val codecFactory = CodecFactory()

        return Converter(codecFactory.extractFromFile(videoFile)).getConverted()
    }
}