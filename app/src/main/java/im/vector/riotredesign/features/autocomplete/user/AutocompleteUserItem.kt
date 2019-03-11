/*
 * Copyright 2019 New Vector Ltd
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package im.vector.riotredesign.features.autocomplete.user

import android.widget.ImageView
import android.widget.TextView
import com.airbnb.epoxy.EpoxyAttribute
import com.airbnb.epoxy.EpoxyModelClass
import im.vector.riotredesign.R
import im.vector.riotredesign.core.epoxy.RiotEpoxyHolder
import im.vector.riotredesign.core.epoxy.RiotEpoxyModel
import im.vector.riotredesign.features.home.AvatarRenderer

@EpoxyModelClass(layout = R.layout.item_autocomplete_user)
abstract class AutocompleteUserItem : RiotEpoxyModel<AutocompleteUserItem.Holder>() {

    @EpoxyAttribute var name: String? = null
    @EpoxyAttribute var avatarUrl: String? = null

    override fun bind(holder: Holder) {
        holder.nameView.text = name
        AvatarRenderer.render(avatarUrl, name, holder.avatarImageView)
    }

    class Holder : RiotEpoxyHolder() {
        val nameView by bind<TextView>(R.id.userAutocompleteName)
        val avatarImageView by bind<ImageView>(R.id.userAutocompleteAvatar)
    }

}