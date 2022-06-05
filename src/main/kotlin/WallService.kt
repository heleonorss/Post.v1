class WallService {
    var posts = emptyArray<Post>()
    private var comments = emptyArray<Comment>()

    fun createComment(comment: Comment): Boolean {
        for (postForSearch in posts) {
            if (comment.postId == postForSearch.id) {
                comments += comment
                return true
            }
        }
        throw PostNotFoundException("There is no post with ID${comment.postId}")
    }

    fun add(post: Post): Post {
        if (posts.isEmpty()) {
            val newPost = post.copy(id = 1)
            posts += newPost
        } else {
            val postLast = posts.last().id + 1
            // val idNewPost = postLast.id + 1
            val newPost = post.copy(id = postLast)
            posts += newPost
        }
        return posts.last()
    }

    fun update(post: Post): Boolean {
        for ((index, element) in posts.withIndex()) {
            if (element.id == post.id) {
                posts[index] = element.copy(
                    id = post.id,
                    fromId = post.fromId,
                    text = post.text,
                    replyOwnerId = post.replyOwnerId,
                    replyPostId = post.replyPostId,
                    friendsOnly = post.friendsOnly,
                    comments = post.comments,
                    copyright = post.copyright,
                    likes = post.likes,
                    reposts = post.reposts,
                    views = post.views,
                    postType = post.postType,
                    canPin = post.canPin,
                    canDelete = post.canDelete,
                    canEdit = post.canEdit,
                    isPinned = post.isPinned,
                    markedAsAds = post.markedAsAds,
                    isFavorite = post.isFavorite,
                    donut = post.donut
                )
                return true
            }
        }
        return false
    }

}