/* KhlKt - a SDK of <https://kaiheila.cn> for JVM platform
Copyright (C) 2022, zly2006 & contributors

This program is free software: you can redistribute it and/or modify
it under the terms of the GNU Affero General Public License as published
by the Free Software Foundation, either version 3 of the License, or
(at your option) any later version.

This program is distributed in the hope that it will be useful,
but WITHOUT ANY WARRANTY; without even the implied warranty of
MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
GNU Affero General Public License for more details.

You should have received a copy of the GNU Affero General Public License
along with this program.  If not, see <https://www.gnu.org/licenses/>.*/

package io.github.zly2006.khlkt.contract

import io.github.zly2006.khlkt.client.Client
import io.github.zly2006.khlkt.utils.Updatable

class GuildUser(
    client: Client,
    id: String,
    oline: Boolean,
    name: String,
    val nickname: String,
    identifyNumber: String,
    status: UserState,
    bot: Boolean,
    mobilePhoneVerified: Boolean,
    avatarUrl: String,
    vipAvatarUrl: String,
    isVip: Boolean,
    @field:Transient
    val roles: List<GuildRole>,
    joinTime: Int,
    activeTime: Int,
) : User(client,
    id,
    oline,
    name,
    identifyNumber,
    status,
    bot,
    mobilePhoneVerified,
    avatarUrl,
    vipAvatarUrl,
    isVip,
    joinTime,
    activeTime), Updatable {
    override fun update() {
        TODO("Not yet implemented")
    }
}