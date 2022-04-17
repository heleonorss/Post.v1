

fun main() {

    val post = Post(
        id = 0,
        ownerId = 11,
        fromId = 22,
        createdBy = 33,
        date = 164803700,
        text = "Hello Monica!",
        replyOwnerId = 44,
        replyPostId = 0,
        friendsOnly = false,
        postType = "post",
        signerId = 55,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 0,
        comments = Comments(1, false, false, false, false),
        copyright = Copyright(0, "default", "Lana", "private"),
        likes = Likes(33, false, false, false),
        reposts = Reposts(1, false),
        views = Views(525),
        donut = Donut(false, 0, false, false, "-", 0)
    )

    val postCat = Post(
        id = 0,
        ownerId = 11,
        fromId = 22,
        createdBy = 33,
        date = 164803700,
        text = "Hello Larica",
        replyOwnerId = 44,
        replyPostId = 0,
        friendsOnly = false,
        postType = "post",
        signerId = 55,
        canPin = true,
        canDelete = true,
        canEdit = true,
        isPinned = false,
        markedAsAds = false,
        isFavorite = false,
        postponedId = 0,
        comments = Comments(1, false, false, false, false),
        copyright = Copyright(0, "default", "Lana", "private"),
        likes = Likes(33, false, false, false),
        reposts = Reposts(1, false),
        views = Views(525),
        donut = Donut(false, 0, false, false, "-", 0)
    )

    val service = WallService()
   service.add(post)
   service.add(postCat)

   service.update(post)
}



