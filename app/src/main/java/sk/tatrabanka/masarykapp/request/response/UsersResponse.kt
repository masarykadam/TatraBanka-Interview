package sk.tatrabanka.masarykapp.request.response

import sk.tatrabanka.masarykapp.model.User

data class UsersResponse(
    val data: List<User>
)