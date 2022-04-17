import org.junit.Test
import org.junit.jupiter.api.Assertions.*
import java.awt.SystemColor.text

internal class WallServiceAddTest {

    @org.junit.jupiter.api.Test
    @Test
    fun add() {
        val post = Post(
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

        //val newPost = WallService.add(post)
        val service = WallService()
        val newPost = service.add(post)
        val result = newPost.id

        assertEquals(1, result)
    }

    @Test
    fun updateTrue() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(
            Post(
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
        )
        service.add(
            Post(
                id = 0,
                ownerId = 66,
                fromId = 77,
                createdBy = 88,
                date = 145803700,
                text = "Hello Monica",
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
        )

        service.add(
            Post(
                id = 0,
                ownerId = 66,
                fromId = 33,
                createdBy = 99,
                date = 189803700,
                text = "Hello Maria",
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
        )
        // создаём информацию об обновлении
        val update = Post(
            id = 1,
            ownerId = 66,
            fromId = 33,
            createdBy = 99,
            date = 189803700,
            text = "Hello Mark",
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

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertTrue(result)
    }


    @org.junit.jupiter.api.Test
    @Test
    fun updateFalse() {
        // создаём целевой сервис
        val service = WallService()
        // заполняем несколькими постами
        service.add(
            Post(
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
        )
        service.add(
            Post(
                id = 0,
                ownerId = 66,
                fromId = 77,
                createdBy = 88,
                date = 145803700,
                text = "Hello Monica",
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
        )

        service.add(
            Post(
                id = 0,
                ownerId = 66,
                fromId = 33,
                createdBy = 99,
                date = 189803700,
                text = "Hello Maria",
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
        )
        // создаём информацию об обновлении
        val update = Post(
            id = 25,
            ownerId = 66,
            fromId = 33,
            createdBy = 99,
            date = 189803700,
            text = "Hello Mark",
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

        // выполняем целевое действие
        val result = service.update(update)

        // проверяем результат (используйте assertTrue или assertFalse)
        assertFalse(result)
    }
}