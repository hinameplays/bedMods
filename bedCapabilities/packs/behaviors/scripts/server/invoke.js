var serverSystem = server.registerSystem(0, 0);

function main(parameter) {
  
    let chatEventData2 = serverSystem.createEventData("minecraft:display_chat_event");
    chatEventData2.data.message = parameter;
    serverSystem.broadcastEvent("minecraft:display_chat_event", chatEventData2);
    
}


export {main};