package com.example.kotlin_youtube

class HomeFeed(val videos: List<Video>)

class Video(val id: Int, val name: String, val link: String, val imageUrl: String, val numberOfViews: Int, val channel: Channel)

class Channel(val name: String, val profileimageUrl: String)