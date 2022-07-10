package io.github.kookybot.events.direct

import io.github.kookybot.contract.PrivateChatUser
import io.github.kookybot.contract.Self
import io.github.kookybot.utils.Emoji

class DirectCancelReactionEvent (
    self: Self,
    @field:Transient
    var emoji: Emoji,
    sender: PrivateChatUser,
    _channelType: String,
    _type: Int,
    targetId: String,
    authorId: String,
    content: String,
    sid: String,
    timestamp: String,
): DirectMessageEvent(self, sender, _channelType, _type, targetId, authorId, content, sid, timestamp)