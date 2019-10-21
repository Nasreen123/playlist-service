package com.playlist.playlist

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.RequestParam
import org.springframework.web.bind.annotation.ResponseBody
import org.springframework.web.bind.annotation.GetMapping
import java.util.concurrent.atomic.AtomicLong


@Controller
class SongController {

    @GetMapping("/song")
    @ResponseBody
    fun getSong(): Song {
        return Song(songLink)
    }

    companion object {
        private val songLink: String = "https://www.youtube.com/watch?v=9F4g5pBrEYE"
    }

}