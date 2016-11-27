from services import UserService as USER_SERVICE


class UserKnot(object):

    def __init__(self, user_id):
        self.user_id = user_id
        self._cached_user = None

    @property
    def user(self):
        if self._cached_user is None:
            self._cached_user = USER_SERVICE.get_user(self.user_id)
        return self._cached_user
