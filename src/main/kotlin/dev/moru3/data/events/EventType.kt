package dev.moru3.data.events

enum class EventType {
    READY,
    ERROR,
    GUILD_STATUS,
    GUILD_CREATE,
    CHANNEL_CREATE,
    VOICE_CHANNEL_SELECT,
    VOICE_SERVER_UPDATE, //VoiceServerUpdateEvent
    VOICE_STATE_UPDATE, //VoiceStateUpdateEvent
    VOICE_SETTINGS_UPDATE,
    VOICE_CONNECTION_STATUS,
    SPEAKING_START,
    SPEAKING_STOP,
    MESSAGE_CREATE,
    MESSAGE_UPDATE,
    MESSAGE_DELETE,
    NOTIFICATION_CREATE,
    ACTIVITY_JOIN,
    ACTIVITY_SPECTATE,
    ACTIVITY_JOIN_REQUEST
}