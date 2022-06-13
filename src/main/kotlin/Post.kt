data class Post(
    val id: Int = 0, //Идентификатор записи.
    val ownerId: Int, //Идентификатор владельца стены, на которой размещена запись
    val fromId: Int, //Идентификатор автора записи
    val createdBy: Int, //Идентификатор администратора, который опубликовал запись
    val date: Int, //Время публикации записи в формате unixtime.
    val text: String, //Текст записи
    val replyOwnerId: Int?, //Идентификатор владельца записи, в ответ на которую была оставлена текущая.
    val replyPostId: Int?, //Идентификатор записи, в ответ на которую была оставлена текущая.
    val friendsOnly: Boolean, // true если запись была создана с опцией «Только для друзей
    val postType: String, // Тип записи, может принимать следующие значения: post, copy, reply, postpone, suggest.
    val signerId: Int?, //Идентификатор автора, если запись была опубликована от имени сообщества и подписана пользователем
    val canPin: Boolean, //Информация о том, может ли текущий пользователь закрепить запись
    val canDelete: Boolean, //Информация о том, может ли текущий пользователь удалить запись
    val canEdit: Boolean, //Информация о том, может ли текущий пользователь редактировать запись
    val isPinned: Boolean, //Информация о том, что запись закреплена
    val markedAsAds: Boolean, //Информация о том, содержит ли запись отметку «реклама»
    val isFavorite: Boolean, //если объект добавлен в закладки у текущего пользователя
    val postponedId: Int, //Идентификатор отложенной записи. Это поле возвращается тогда, когда запись стояла на таймере.
    val comments: Comments?,
    val copyright: Copyright?,
    val likes: Likes?,
    val reposts: Reposts?,
    val views: Views?,
    val donut: Donut?,
    val indexPosts: Int = 0,
    val attachments: Array<Attachments>?,
    val copyHistory: Array<Post>?,
    val postSource: Any?

) {


}

